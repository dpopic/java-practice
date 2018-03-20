# Java practice

Repository contains eclipse project with various solved java assignments. I created this to help my students with learning java and also to provide an introduction to git(hub).

For now project contains solved assignments for:
* Conditions
* Loops
* Arrays
* Strings

## Instructions

These instructions will help you to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to install stuff below if you wish to run the project.

Java IDE
* This project was made in [Eclipse](https://www.eclipse.org/downloads/) so please install it.


Java Runtime and Java SDK:
- Download [Java runtime](https://www.google.com/search?q=Java+Runtime+Download+Oracle) and [Java SDK](https://www.google.com/search?q=Java+SDK+Download+Oracle) directly from Oracle
- Or download both by using [Ninite](https://ninite.com/)

**Note*** It is wise to restart your PC after every install.

### Downloading the project

Please follow these steps if you are new to github and Eclipse.

```
1. Go up on this page and find green button "Clone or download"
2. Select option "Download ZIP"
3. After download, extract the project from ZIP file
*Optionally, you can rename the folder to JavaPractice
```

### Import the project in Eclipse

After we downloaded and extracted the project, let's import it to Eclipse.

```
1. Open Eclipse
2. Select File -> Import -> General -> Existing Projects into Workspace
3. Click button Browse and then find the folder we just extracted. Click on the folder then Click on button "Ok" from zip 
how to import
*Optionally, you can select option copy project to workspace
```

### Running the project

Pressing green button should run the project normally. 

If there is trouble, try:
1. Go to "Project" -> "Clean..." and perform project clean
2. Right click on the project in Package Explorer (left pane) and then select option "Run As" -> "Java application"

Class Main contains main method which will be executed when we run the program. In main method we call methods from other classes depending on what we wish to execute. All methods are public (visible everywhere) & static (access goes through class name). For example, if we wish to run assignment 9 from Arrays we would call the method through class name: 
```
ArraysAssignments.assignment9();
```

**Note*** Holding CTRL and clicking on a method name opens the method code.

## Other stuff

More examples for variables and conditions can be found [here](https://www.w3resource.com/java-exercises/index.php).