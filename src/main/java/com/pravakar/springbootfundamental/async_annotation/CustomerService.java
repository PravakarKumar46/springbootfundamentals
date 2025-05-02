package com.pravakar.springbootfundamental.async_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomerService {

    /**
     * UseCase 1 -> (@SpringBootApplication
     * @EnableAsync
     * public class SpringbootfundamentalApplication {},
     * )
     *
     * Executes asynchronous logic demonstrating the capability of Spring's @Async annotation.
     * This method is designed to run in a separate thread, allowing non-blocking execution while
     * the main thread continues its workflow.
     *
     * The method logs the current thread name to the console to showcase its execution in
     * a different thread pool.
     *
     * Requirements:
     * Ensure that Spring's asynchronous processing is enabled, typically through
     * the usage of @EnableAsync configuration in the application context.
     *
     * Note:
     * The default behavior uses a global TaskExecutor, which can be customized by defining
     * a bean implementing the Executor interface.
     */
  /*  @Async
    public void asyncMethod() {
        System.out.println("inside syncMethod: " + Thread.currentThread().getName());
    }*/

    /**
     * Executes an asynchronous task using a custom thread pool executor.
     * This method demonstrates the use of Spring's @Async annotation with a specified executor.
     *
     * The method is designed to run in a separate thread, offloading the task execution
     * from the main application thread. This enables non-blocking operations and improves
     * application responsiveness.
     *
     * Key Details:
     * - Uses a custom `TaskExecutor` bean named "myOwnTaskExecutor".
     * - Prints the current thread name to the console, highlighting the use of a separate thread.
     *
     * Prerequisites:
     * - Ensure that Spring's asynchronous functionality is enabled by adding the @EnableAsync annotation
     *   in the application configuration.
     *
     * Note:
     * - The custom executor must be defined and configured to manage thread pools effectively
     *   (e.g., using `ThreadPoolTaskExecutor`).
     */
/*    @Async("myOwnTaskExecutor")
    public void asyncMethod() {
        System.out.println("inside syncMethod: MyThread-" + Thread.currentThread().getName());
    }*/

    @Autowired
    AsyncAppConfig asyncAppConfig;
    @Async
    public void asyncMethod() {
        Thread currentThread = Thread.currentThread();
//        System.out.println("Thread Details:");
//        System.out.println("Name: " + currentThread.getName());
//        System.out.println("ID: " + currentThread.getId());
//        System.out.println("Priority: " + currentThread.getPriority());
//        System.out.println("Thread Group: " + currentThread.getThreadGroup().getName());
    }

}
