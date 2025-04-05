# Dispatcher Comparison App

A simple Android app to compare Kotlin coroutine dispatchers in terms of performance and thread usage. This app demonstrates the difference between `Dispatchers.Main`, `Dispatchers.IO`, `Dispatchers.Default`, `Dispatchers.Unconfined`, and a **custom dispatcher**.

---

## **Features**
- Compare multiple dispatchers using 100 tasks each.
- Demonstrates real-time logging of task completion times and thread names.
- Custom dispatcher for sequential task execution.
- Real-time comparison of task execution and threads used by different dispatchers.

---

## **Technologies**
- **Kotlin**: Programming language used for app development.
- **Android**: Mobile platform for app deployment.
- **Coroutines**: Asynchronous programming framework to handle background tasks.
- **Executors**: For creating custom dispatchers with isolated thread pools.

---

## **How to Run**
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Malikfarooq/CoroutineDispatcherDemo.git
