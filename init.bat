
SET MAVEN_OPTS=-Xms2048m -Xmx2048m
SET MAVEN_HOME=C:\apps\apache-maven-3.6.0
SET MAVEN_HOME_BIN=%MAVEN_HOME%\bin
SET JAVA_HOME=C:\apps\jdk-12.0.2
SET NP=%JAVA_HOME%\bin

@echo off
echo %PATH%|find /i "%NP%">nul  || set path=%NP%;%PATH%
echo %PATH%|find /i "%MAVEN_HOME_BIN%">nul  || set path=%MAVEN_HOME_BIN%;%PATH%

@echo on
echo path = %PATH%