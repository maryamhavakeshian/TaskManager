#########################Introduction##################################################
This program is written in java language and aims to do task manager.
##########################Running instruction###########################################
task-manager-with-java project generate its own inputs (tasks which are being executed), and prints the output of the project in the console.
To run the program, it is simply required to execute the Main class.

######################## Compile Instruction###########################################
The project files are available for standalone execution
The project can be complied through either IntelliJ IDEA or Eclipse IDE.

#########################Problem Statement############################################
The code enables  real time performance, through considering each task as a thread, and all the threads(tasks) are being executed by
the thread pool whose size is a predefined value. 


#########################Main method############################################
First, an instance PriorityBlockingQueue is created to contain the existing tasks with their priorities. 
The implementation of PriorityBlockingQueue utilizes reentrant lock mechanism to provide mutual exclusion
to prevent race condition, while prioritizing issues. It, also, prioritize tasks based on their priorities. 
We consider the lowest value has the highest priority prioritization. The use of PriorityBlockingQueue
facilitates prioritization and race condition prevention (while prioritizing tasks).
Otherwise, we should implement these two mechanisms manually.

The executor service creates a thread pool with a predefined size.
ExecutorService contains factory methods (implemented in newFixedThreadPool method)
to generate multiple types of working threads.  Indeed, the executor service enables
JAVA to explicitly handles the creation and management of threads. Then, the task with
their priorities are added to the blockingqueue in which all mutual exclusion and prioritization
issues are handled by the implementation of the blockingqueue. If we need mutual exclusion for a
shared resource ( the question does not mention such a requirement, we should choose pertinent mutual
exclusion techniques, such as semaphore( for using memory) or locking (accessing file)).
Finally, calling invokeAll() method, the executor service executes the given list of callable tasks.
All tasks are executed at different time duration as there are only five threads in thread pool.

#########################Main method############################################

Each task is considered as a thread, which are represented in the task Class. Task class implements callable interface 
(enabling the task being managed by threadpool) A priority is assigned to each task, based on which the tasks are 
prioritized in a thread pool. The method call is the exection of task. the method is called by the invokeAll methods of executorservice. 
