# GitLearningRepo
This repo is a part of Git Learning tutorial on Apni Kaksha
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
choco install intellijidea-community --params="'/CreateDesktopIcon'"
choco install git.install
choco install postgresql --params "'/Password:mypassword'" -y
