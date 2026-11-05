# UserMockingDemo — Spring Boot Controller Mocking Lab

This is one standard Maven Spring Boot project. The same folder can be opened in **Visual Studio Code** or imported into **Spring Tool Suite (STS)**.

## Requirements

- JDK 17 or newer
- Maven 3.6.3 or newer (or Maven support configured in your IDE)
- Internet access on the first build so Maven can download dependencies

## Project contents

- `pom.xml` — Maven dependencies and Spring Boot configuration
- `UserMockingDemoApplication.java` — Spring Boot entry point
- `UserService.java` — service dependency
- `UserController.java` — `/users` controller endpoint
- `UserControllerTest.java` — controller-only test using MockMvc and Mockito
- `.vscode/` — recommended VS Code extensions and Maven tasks

## Open in Visual Studio Code

1. Extract the ZIP file.
2. Open VS Code.
3. Select **File → Open Folder** and choose the extracted `UserMockingDemo_IDE` folder (the folder containing `pom.xml`).
4. Install the recommended extensions when prompted: **Extension Pack for Java** and **Spring Boot Extension Pack**.
5. Make sure VS Code is using JDK 17 or newer.
6. Open the integrated terminal at the project root and run:

   ```bash
   mvn clean test
   ```

   Alternatively, press `Ctrl+Shift+P`, choose **Tasks: Run Task**, then select **Maven: clean test**.

## Import into Spring Tool Suite (STS)

1. Extract the ZIP file.
2. Open STS.
3. Select **File → Import → Maven → Existing Maven Projects**.
4. Browse to the extracted folder containing `pom.xml`.
5. Select the project and click **Finish**.
6. If needed, right-click the project → **Maven → Update Project**.
7. Right-click `UserControllerTest.java` → **Run As → JUnit Test**.

## Expected test result

The test should pass with:

- Tests run: 1
- Failures: 0
- Errors: 0

The test verifies:

- GET `/users`
- HTTP status `200 OK`
- Response body `List of Users`

## Run the application (optional)

Run:

```bash
mvn spring-boot:run
```

Then open `http://localhost:8080/users` in a browser. Expected response:

```text
List of Users
```

Stop the application with `Ctrl+C`.

## Important notes

- No database is required for this lab.
- The controller test uses `@WebMvcTest` and `@MockBean`. This is compatible with the Spring Boot 3.3.5 version declared in this project.
- The test does not start a real web server; MockMvc simulates the HTTP request.
- If Maven is not installed or configured in your system, install Maven or configure your IDE's Maven support before running the commands.
