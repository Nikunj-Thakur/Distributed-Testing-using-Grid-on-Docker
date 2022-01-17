# Distributed-Testing-using-Grid-on-Docker
This is a sample project to set-up and demonstrate distributed parallel testing using Selenium Grid using Docker Containers. The Hub and Nodes are running on light-weight Docker Containers to achieve distributed parallel testing.


# Tools Required and Pre-requisites

### 1. Java should be installed on your system
### 2. JAVA_HOME path should be set-up in your system's environment variable
### 3. Eclipse/IntelliJ IDE should be installed on your system
### 4. Docker Desktop should be installed on your system. (If you have lower version of Windows OS, please install Docker Toolbox which comes with Kitematics)
### 5. Windows Subsytem for Linux (WSL-2) should be installed on your system.
### 6. Virtualization should be enabled in your BIOS setting.
### 7. VNC Server and VNC Viewer should be up and running to monitor/debug the windows opening on the node containers.
### 8. Docker Engine/Daemon should be up and running.
### 9. Selenium Standalone Grid should be up and running in the selenium/hub (tag: 3.141.59-20210929) container. (Latest version 4.1.1 of Grid is not very stable as of now)
### 10. Selenium Standalone Node having Chrome Browser should be up and running in the selenium/node-chrome-debug container. 


# Commands

### 1. To create a common network [$ docker network create grid]
### 2. To pull image from Docker Hub and run the Selenium Hub container on port 4444 [$ docker run -d -p 4444:4444 --net grid --name selenium-hub selenium/hub:3.141.59-20210929]
### 3. To pull image from Docker Hub and run the Selenium Chrome-Debug node container on port 4446 [$ docker run -d -p 4446:5900 --net grid -e HUB_HOST=selenium-hub --shm-size=2g selenium/node-chrome-debug:3.141.59-20210929]


# All Screens
<img src=https://github.com/Nikunj-Thakur/Distributed-Testing-using-Grid-on-Docker/blob/main/AllScreensAll.PNG>

# Container Node running Chrome
<img src=https://github.com/Nikunj-Thakur/Distributed-Testing-using-Grid-on-Docker/blob/main/Container.PNG>

# Container Environment Configuration
<img src=https://github.com/Nikunj-Thakur/Distributed-Testing-using-Grid-on-Docker/blob/main/Env.PNG>

# Selenium Grid running on Docker Container
<img src=https://github.com/Nikunj-Thakur/Distributed-Testing-using-Grid-on-Docker/blob/main/Grid.PNG>

# Logs of Node Container running Chrome
<img src=https://github.com/Nikunj-Thakur/Distributed-Testing-using-Grid-on-Docker/blob/main/Logs.PNG>

