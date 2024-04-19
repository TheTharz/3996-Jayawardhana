# Node.js Application with Jenkins Pipeline

This repository contains a simple Node.js application along with a Jenkins pipeline script for automating the build, run, push, and checking processes using Docker containers.

## Prerequisites

- Docker installed on your system.
- Jenkins configured with Docker credentials for pushing Docker images to a registry.

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/TheTharz/3996-Node-Pipeline.git
   ```

2. Set up your Docker environment.

3. Configure your Jenkins pipeline to use the provided Jenkinsfile.

4. Run the Jenkins pipeline to automate the following tasks:
   - Build the Docker image for the Node.js application.
   - Run the Docker container with the built image.
   - Check the status of running Docker containers.
   - Push the Docker image to a Docker registry.

## Jenkins Pipeline

The Jenkins pipeline defined in `Jenkinsfile` consists of the following stages:

1. **Build:**
   - Builds the Docker image for the Node.js application using the provided Dockerfile.

2. **Run:**
   - Runs the Docker container with the built image, exposing port 3000 on port 5000 of the host.

3. **Final:**
   - Checks the status of running Docker containers to verify that the application container is running.

4. **Push:**
   - Logs in to Docker using provided credentials and pushes the Docker image to the specified registry.

5. **Create README:**
   - Generates this README file dynamically as part of the Jenkins pipeline execution.

## Usage

1. Clone this repository:

   ```bash
   git clone https://github.com/TheTharz/3996-Node-Pipeline.git
   ```

2. Set up your Docker environment.

3. Configure Jenkins with the necessary credentials and install required plugins.

4. Create a new Jenkins pipeline job and point it to the Jenkinsfile in this repository.

5. Run the Jenkins pipeline job to automate the Docker image build, container deployment, and image push processes.

---

Feel free to customize this README with additional information about your application, usage instructions, or any other relevant details.
