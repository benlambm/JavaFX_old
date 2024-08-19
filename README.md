# Starter JavaFX FXML Application

A simple JavaFX FXML application that launches a blank window. It's structured as a Maven project and utilizes JavaFX for the graphical interface.

## Prerequisites

- JDK 21 
- Maven 3.6.0 
- Git 
- Optional: GitHub Desktop app



## Getting Started

### Downloading the Source Code

#### Option 1: Download ZIP

1. Go to the GitHub repository page.
2. Click on the "Code" button.
3. Select "Download ZIP".
4. Extract the ZIP file to your preferred location.

#### Option 2: Clone with Git (Command Line)

1. Open your terminal or command prompt.
2. Navigate to the directory where you want to clone the repository.
3. Run the following command:
   
   ```
   git clone https://github.com/benlambm/your-repo-name.git
   ```

#### Option 3: Clone with GitHub Desktop

1. Install GitHub Desktop if you haven't already.
2. Go to the GitHub repository page.
3. Click on the "Code" button.
4. Select "Open with GitHub Desktop".
5. Choose where to save the repository on your local machine.

### Importing into Eclipse

1. Open Eclipse IDE.
2. Go to File > Import.
3. Select "Existing Maven Projects" under the Maven folder.
4. Browse to the directory where you downloaded or cloned the repository.
5. Select the project and click "Finish".

## Building the Project

To compile the project, execute the following Maven command in the terminal from the root directory of the project:

```bash
mvn clean install
```

## Running the Application

After building the project, you can run the application using the JavaFX Maven plugin with the following command:

```bash
mvn clean javafx:run
```

This command will launch a simple window demonstrating a basic JavaFX application setup.

## Packaging the Application

To create an executable JAR file that includes all necessary dependencies, run:

```bash
mvn clean package
```

You can then execute the JAR file using:

```bash
java -jar target/game-1.2.3.jar
```

## Contributing to the Class Project

### Creating a New Branch

1. Ensure you're on the main branch:
   
   ```
   git checkout main
   ```
2. Create and switch to a new branch:
   
   ```
   git checkout -b your-branch-name
   ```

### Making Changes

1. Make your changes in the code.
2. Stage your changes:
   
   ```
   git add .
   ```
3. Commit your changes:
   
   ```
   git commit -m "Brief description of your changes"
   ```

### Pushing Changes and Creating a Pull Request

1. Push your branch to GitHub:
   
   ```
   git push origin your-branch-name
   ```
2. Go to the repository page on GitHub.
3. Click on "Pull requests" and then "New pull request".
4. Select your branch to compare with the main branch.
5. Add a title and description for your pull request.
6. Click "Create pull request".

### Using GitHub Desktop for Pull Requests

1. Open GitHub Desktop and select your repository.
2. Ensure your changes are committed.
3. Click on "Push origin" to push your branch to GitHub.
4. Click on "Create Pull Request".
5. Review your changes and click "Create Pull Request" on GitHub.

Remember to always pull the latest changes from the main branch before starting your work to ensure you're working with the most up-to-date code.

## Contributing

Please fork this repository and submit a pull request with your improvements.
