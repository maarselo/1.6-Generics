 # 🔧 1.6-JavaGenerics

A complete set of exercises focused on Java generics, covering generic classes, methods, bounded types, and type flexibility.
This project demonstrates how to work with generics to build flexible, reusable, and type-safe Java applications.

## 📄 Description - Exercise Statement
This repository contains the full solution for Sprint 1 - Generics of the Java programming track.
The sprint is divided into three levels, gradually introducing advanced usage of generic types in Java, including wildcards and type bounds.

## 📦 Level 1

### Exercise 1
Implements a class called NoGenericMethods that stores three arguments of the same type.
It includes methods to store and retrieve these objects, and a constructor that initializes the three values.
It is tested to ensure that the arguments can be passed in any order when calling the constructor.

### Exercise 2
Implements a Person class with fields: name, surname, and age.
Then, creates a class GenericMethods with a generic method that accepts three arguments of any type.
This method simply prints the arguments to the screen.

In the main() method of the main class, the generic method is invoked with various argument types (e.g., a Person object, a String, and a primitive).
This demonstrates that the method can handle any type and any order of parameters.

## ⚙️ Level 2
### Exercise 1
Modifies the previous exercise so that one of the parameters of the generic method is no longer generic.
### Exercise 2
Further modifies the generic method so that its parameters are passed as a variable-length argument list (varargs) using generics.

## 📱 Level 3
### Exercise 1
This exercise introduces an interface Phone and three classes: Smartphone, GenericClass, and Main.

The Phone interface defines a method call().
The class Smartphone implements Phone, and also includes a method takePhotos().

The class GenericClass defines two generic methods:
- The first one accepts a type argument bounded by the Phone interface
- The second one accepts a type argument bounded by the Smartphone class

From within these two methods, the appropriate actions (call() and takePhotos()) are executed.

In the main() method of Main, a Smartphone object is passed to both methods of the GenericClass.

Question posed in the exercise:
Can the method bounded by the Phone interface also invoke takePhotos() from Smartphone?

## 💻 Technologies Used
- Java (SDK 17+)
- IntelliJ IDEA or any Java-compatible IDE
- Gradle (build tool)

## 📋 Requirements
Before running this project, make sure you have:

- Java SDK **17+** or higher (SDK 23 was used during development)
- An IDE like IntelliJ IDEA or Eclipse
- Git (optional, for version control)
- Gradle 8.10+

## 🛠️ Installation

To run this project, you **must first clone the repository locally**. Otherwise, you won't be able to open it correctly in IntelliJ IDEA.
To get a local copy of the project:

```bash
# Clone this repository
git clone https://github.com/maarselo/1.6-Generics.git

# Navigate into the project directory
cd 1.6-Generics/
```

### 📥 Cloning and Opening in IntelliJ IDEA

1. Open **IntelliJ IDEA**.
2. On the welcome screen, click **"Clone Repository"** (Get from Version Control).
3. Paste the following URL into the **URL** field:
```bash
https://github.com/maarselo/1.6-Generics.git
```
4. Choose the folder where the project should be saved.
5. Click **Clone**.

 if you already have it cloned, click on `Open` and select the local copy to open it. 

## ▶️ Running the Project

Each exercise is organized in separate classes under appropriate packages (e.g., level1, level2, level3).
To run a specific exercise:
- Locate the class with the main() method (e.g., Main.java)
- Right-click the file and select Run, or press Shift + F10

If building via terminal, use Gradle:
```bash
./gradlew build
./gradlew run
```
Make sure to adjust the class and path names according to each exercise. And pass an argument too if necessary as in the first level where folders have to be passed.

## 🌐 Deployment

This project is intended to run in a **local development environment** only.  
No production deployment configuration has been defined.

In the future, it could be extended into a GUI or web-based application for a better user experience.

## 🤝 Contributions

Contributions are welcome! If you’d like to collaborate:

1. Fork this repository.
2. Create a new branch:  
 `git checkout -b feature/YourFeatureName`
3. Make your changes and commit them:  
 `git commit -m "Add: Your meaningful commit message"`
4. Push your branch to your fork:  
 `git push origin feature/YourFeatureName`
5. Open a pull request with a clear description of your changes.

Thanks for your interest and support! 🚀
