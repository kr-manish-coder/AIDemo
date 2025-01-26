# AI Demo Project

This is a demo project that demonstrates an AI-based Spring Boot application. It features REST APIs for processing prompts and interacting with a chatbot using a reactive programming approach.

## Features

- **Reactive API**: The application utilizes Spring WebFlux to provide non-blocking, reactive streams.
- **Chatbot Integration**: Sends user prompts to the chatbot model and streams responses.
- **Customizable AI Model**: Uses the `OllamaChatModel` client for processing requests.

## Technologies Used

- **Java 20**
- **Spring Boot**
- **Spring WebFlux**
- **Reactive Programming**
- **Jakarta EE**
- **Maven** (or another build tool)

## Getting Started

To run this project locally, follow these steps:

### Prerequisites

1. **Java 20**: Ensure you have JDK 20 installed.
2. **Maven**: Install Maven if it's the build tool used in the project.
3. **IDE**: IntelliJ IDEA or any Java-supporting IDE.
4. **Download and install Ollama**: Download link : https://ollama.com/
5. **After downloading Ollama, Run this command from terminal (You can find it here : https://ollama.com/library/mistral)**: ollama run mistral 

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <project-directory>
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

### Running the Application

1. Start the application:
   ```bash
   mvn spring-boot:run
   ```
   Alternatively, use your IDE's configuration to run the `main` class.

2. Access the APIs using a tool like Postman or cURL.

### API Endpoints

The application exposes the following REST API endpoints:

#### 1. **Process Prompt**
   - **Endpoint**: `/ai/prompt`
   - **Method**: `GET`
   - **Description**: Streams the AI model's responses for a given user prompt.
   - **Example**:
     ```bash
     curl "http://localhost:8080/ai/prompt?prompt=Hello"
     ```

#### 2. **Chatbot Interaction**
   - **Endpoint**: `/ai/chatbot`
   - **Method**: `POST`
   - **Description**: Streams the chatbot's responses for a textual input sent in the request body.
   - **Example**:
     ```bash
     curl -X POST "http://localhost:8080/ai/chatbot" -H "Content-Type: text/plain" -d "Tell me about Java"
     ```

## Project Structure

The project follows a standard Spring Boot project structure:

- **`controllers`**: Contains the `AIController` which defines REST endpoints.
- **`services` (if applicable)**: Includes business logic (can be added if needed in future).
- **`model`**: Represents the AI model client (`OllamaChatModel`).

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Contribution

Contributions are welcome! Feel free to open issues or submit pull requests.

## Contact

**Author**: Manish  
For questions or support, feel free to reach out at `mailme.manishverma@gmail.com`.

---

### Notes
- Replace `<repository-url>` with the actual Git repository URL of your project.
- Update `[your-email@example.com]` with your email or preferred method of contact.

Let me know if you want me to help you save this file in the project directory! 😊