package com.pravakar.springbootfundamental.async_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

//@Configuration
//public class AsyncAppConfig {
//
//    /**
//     * Customizing the thread pool executor - UseCase 2
//     */
//    @Bean(name = "myOwnTaskExecutor")
//    public Executor taskExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(2);
//        executor.setMaxPoolSize(4);
//        executor.setQueueCapacity(3);
//        executor.setThreadNamePrefix("MyThread-");
//        executor.initialize();
//        return executor;
//    }
//
//}
@Configuration
public class AsyncAppConfig implements AsyncConfigurer {

    /**
     * UseCase 2
     *
     */

/*    @Bean(name = "myOwnTaskExecutor")
    public Executor taskExecutor() {

        int minPoolSize = 2;
        int maxPoolSize = 4;
        long keepAliveTime = 10;             // Time for extra threads to live when idle
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(10); // Queue for tasks

        ThreadFactory threadFactory = Executors.defaultThreadFactory();    // Default thread creator

        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy(); // What to do when queue is full

        // Create the ThreadPoolExecutor
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                minPoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.HOURS,
                workQueue,
                threadFactory,
                handler
        );

        return executor;
    }*/

    /**
     * UseCase 3
     */

    private ThreadPoolExecutor poolExecutor;

    @Override
    public synchronized Executor getAsyncExecutor() {

        if (poolExecutor == null) {
            int minPoolSize = 2;
            int maxPoolSize = 4;
            long keepAliveTime = 10;             // Time for extra threads to live when idle
            BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(10); // Queue for tasks

            ThreadFactory threadFactory = Executors.defaultThreadFactory();    // Default thread creator

            RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy(); // What to do when queue is full


            poolExecutor = new ThreadPoolExecutor(minPoolSize, maxPoolSize, keepAliveTime, TimeUnit.HOURS, workQueue, threadFactory, handler);
        }

        return poolExecutor;
    }
}

class CustomThreadFactory implements ThreadFactory {

    private final String executorName;
    private int counter = 0;

    public CustomThreadFactory(String executorName) {
        this.executorName = executorName;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        counter++;
        Thread thread = new Thread(runnable);
        thread.setName(executorName + "-Thread-" + counter);
        return thread;
    }

}
