# AVIANCA AUTOMATION TEST

## Setup the test's

How to run the test

# Install the next dependencies:

+ GIT
```
https://github.com/git-for-windows/git/releases/download/v2.32.0.windows.2/Git-2.32.0.2-64-bit.exe
```

+ JAVA
```
https://javadl.oracle.com/webapps/download/AutoDL?BundleId=245060_d3c52aa6bfa54d3ca74e617f18309292
```

+ GRADLE
```
https://gradle.org/next-steps/?version=7.1.1&format=all
```
Create a folder in C: named Gradle -> unzip the file and copy the contents to C:\Gradle

+ IntelliJ IDEA Ultimate
```
https://www.jetbrains.com/es-es/idea/download/download-thanks.html?platform=windows
```
Install in trial version

# Set the environment variables
Press windows key -> type variables -> click "Editar las variables de entorno del sistema" -> in the variables del usuario section click on path -> click in Editar -> click Nuevo -> Paste C:\Gradle\bin

# Clone the repository
go to the following location C:\Users\{USER}\IdeaProjects\ and clone the repository
```
git clone https://github.com/SebastianRivas/avianca.git
```

# Run the test
+ First Step: Open IntelliJ IDEA -> click File -> click Open -> Select the folder avianca
+ Second Step: click Build -> Click Built Project (Update missing dependencies if needed, intellj IDEA will tell you which ones to install and the recommended installation).
+ Third step: click run -> click Run 'Feature avianca'
