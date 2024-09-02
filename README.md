# Local LLM Chat Java Project
![Hal 9000 from 2001: A Space Odyssey](hal9000.webp)
The Local LLM Chat Java Project is designed to interact with a locally hosted language model server. The project consists of a Java application that sends chat messages to the server and receives responses.

## Setup Instructions

1. Download a model from Hugging Face.
2. Run the `llmstudio` in server mode.
    - Head to the Local Server tab ( <-> on the left)
    - Load the LLM you downloaded by choosing it from the dropdown.
    - Change the port to 8000.
    - Start the server by clicking on the green Start Server button.
    - You can verify the server is running by checking the logs or visiting http://localhost:8000 in your browser.

## Running the Java File in Visual Studio Code

1. Open Visual Studio Code.
2. Open the project directory in Visual Studio Code.
3. Ensure you have the Java Extension Pack installed. If not, you can install it from the Extensions view
4. Open the ChatWithLmstudio.java file.
5. Click on the Run button at the top right corner of the editor or right-click inside the editor and select Run Java.
6. The output will be displayed in the Terminal or Output pane.