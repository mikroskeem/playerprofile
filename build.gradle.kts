plugins {
    java
    id("net.minecrell.licenser") version "0.3"
    id("maven-publish")
}

group = "eu.mikroskeem"
version = "0.0.1-SNAPSHOT"

// Repositories
repositories {
    mavenLocal()
    mavenCentral()
}

// Project dependencies
dependencies {
    implementation("org.jetbrains:annotations:15.0")
}

// Sources jar
val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}

val javadocJar by tasks.creating(Jar::class) {
    dependsOn(tasks["javadoc"])
    classifier = "javadoc"
    from((tasks["javadoc"] as Javadoc).destinationDir)
}


// Javadoc jar

// Publishing task
publishing {
    (publications) {
        "mavenJava"(MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar)
            artifact(javadocJar)
        }
    }

    repositories {
        maven {
            name = "mikroskeem-repo"
            setUrl("https://repo.wut.ee/repository/mikroskeem-repo")

            credentials {
                username = rootProject.properties["wutRepoUsername"] as String?
                password = rootProject.properties["wutRepoPassword"] as String?
            }
        }
    }
}

// Wrapper task
task("wrapper", Wrapper::class) {
    gradleVersion = "4.3.1"
    distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}