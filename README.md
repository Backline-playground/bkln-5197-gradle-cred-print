# bkln-5197-gradle-cred-print

Test fixture for BKLN-5197. `gradlew` prints the registry settings Backline wrote, and the project's own `gradle.properties`, before handing over to the real wrapper (`gradlew.real`), so any agent that runs Gradle prints them. Every login involved is fake.
