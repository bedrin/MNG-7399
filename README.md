# Test project to reproduce MNG-7399

https://issues.apache.org/jira/projects/MNG/issues/MNG-7399

`mvn -X clean install` would fail on 32-bit Java 18-ea or 19-ea running on Windows:

```
Apache Maven 3.8.4 (9b656c72d54e5bacbed989b64718c159fe39b537)
Maven home: C:\work\opt\apache-maven-3.8.4
Java version: 19-ea, vendor: Azul Systems, Inc., runtime: C:\work\opt\zulu19.0.21-ea-jdk19.0.0-ea.6-win_i686
Default locale: en_GB, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "x86", family: "windows"
```

Example of failure is shown below. Full log available here: https://raw.githubusercontent.com/bedrin/MNG-7399/master/build.log

It looks like a race condition - it doesn't reproduce on GitHub actions runners for this synthetic project:
https://github.com/bedrin/MNG-7399/actions/runs/1833480888

But real projects do fail:
https://github.com/sniffy/sniffy/runs/4958050103?check_suite_focus=true
https://github.com/sniffy/sniffy/runs/4952023603?check_suite_focus=true
https://github.com/sniffy/sniffy/runs/4950880395?check_suite_focus=true
https://github.com/sniffy/sniffy/runs/4949994245?check_suite_focus=true
https://github.com/sniffy/sniffy/runs/4894124289?check_suite_focus=true

<details>
<summary>

```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean (default-clean) on project project8: The parameters 'reportDirectory' for goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean are missing or invalid -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean (default-clean) on project project8: The parameters 'reportDirectory' for goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean are missing or invalid
```

</summary>

```
[INFO] ------------------------< org.gradle:project8 >-------------------------
[INFO] Building project8 1.0-SNAPSHOT                                    [9/10]
[INFO] --------------------------------[ jar ]---------------------------------
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] === PROJECT BUILD PLAN ================================================
[DEBUG] Project:       org.gradle:project8:1.0-SNAPSHOT
[DEBUG] Dependencies (collect): []
[DEBUG] Dependencies (resolve): [compile, runtime, test]
[DEBUG] Repositories (dependencies): [central (https://repo.maven.apache.org/maven2, default, releases)]
[DEBUG] Repositories (plugins)     : [central (https://repo.maven.apache.org/maven2, default, releases)]
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-clean-plugin:2.5:clean (default-clean)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
<directory default-value="${project.build.directory}"/>
<excludeDefaultDirectories default-value="false">${clean.excludeDefaultDirectories}</excludeDefaultDirectories>
<failOnError default-value="true">${maven.clean.failOnError}</failOnError>
<followSymLinks default-value="false">${clean.followSymLinks}</followSymLinks>
<outputDirectory default-value="${project.build.outputDirectory}"/>
<reportDirectory default-value="${project.reporting.outputDirectory}"/>
<retryOnError default-value="true">${maven.clean.retryOnError}</retryOnError>
<skip default-value="false">${clean.skip}</skip>
<testOutputDirectory default-value="${project.build.testOutputDirectory}"/>
<verbose>${clean.verbose}</verbose>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-resources-plugin:2.6:resources (default-resources)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
<buildFilters default-value="${project.build.filters}"/>
<encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
<escapeString>${maven.resources.escapeString}</escapeString>
<escapeWindowsPaths default-value="true">${maven.resources.escapeWindowsPaths}</escapeWindowsPaths>
<includeEmptyDirs default-value="false">${maven.resources.includeEmptyDirs}</includeEmptyDirs>
<outputDirectory default-value="${project.build.outputDirectory}"/>
<overwrite default-value="false">${maven.resources.overwrite}</overwrite>
<project default-value="${project}"/>
<resources default-value="${project.resources}"/>
<session default-value="${session}"/>
<supportMultiLineFiltering default-value="false">${maven.resources.supportMultiLineFiltering}</supportMultiLineFiltering>
<useBuildFilters default-value="true"/>
<useDefaultDelimiters default-value="true"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-compiler-plugin:3.9.0:compile (default-compile)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
<basedir default-value="${basedir}"/>
<buildDirectory default-value="${project.build.directory}"/>
<compilePath default-value="${project.compileClasspathElements}"/>
<compileSourceRoots default-value="${project.compileSourceRoots}"/>
<compilerId default-value="javac">${maven.compiler.compilerId}</compilerId>
<compilerReuseStrategy default-value="${reuseCreated}">${maven.compiler.compilerReuseStrategy}</compilerReuseStrategy>
<compilerVersion>${maven.compiler.compilerVersion}</compilerVersion>
<debug default-value="true">${maven.compiler.debug}</debug>
<debuglevel>${maven.compiler.debuglevel}</debuglevel>
<encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
<executable>${maven.compiler.executable}</executable>
<failOnError default-value="true">${maven.compiler.failOnError}</failOnError>
<failOnWarning default-value="false">${maven.compiler.failOnWarning}</failOnWarning>
<forceJavacCompilerUse default-value="false">${maven.compiler.forceJavacCompilerUse}</forceJavacCompilerUse>
<fork default-value="false">${maven.compiler.fork}</fork>
<generatedSourcesDirectory default-value="${project.build.directory}/generated-sources/annotations"/>
<maxmem>${maven.compiler.maxmem}</maxmem>
<meminitial>${maven.compiler.meminitial}</meminitial>
<mojoExecution default-value="${mojoExecution}"/>
<optimize default-value="false">${maven.compiler.optimize}</optimize>
<outputDirectory default-value="${project.build.outputDirectory}"/>
<parameters default-value="false">${maven.compiler.parameters}</parameters>
<project default-value="${project}"/>
<projectArtifact default-value="${project.artifact}"/>
<release>${maven.compiler.release}</release>
<session default-value="${session}"/>
<showDeprecation default-value="false">${maven.compiler.showDeprecation}</showDeprecation>
<showWarnings default-value="false">${maven.compiler.showWarnings}</showWarnings>
<skipMain>${maven.main.skip}</skipMain>
<skipMultiThreadWarning default-value="false">${maven.compiler.skipMultiThreadWarning}</skipMultiThreadWarning>
  <source default-value="1.7">1.8</source>
  <staleMillis default-value="0">${lastModGranularityMs}</staleMillis>
  <target default-value="1.7">1.8</target>
  <useIncrementalCompilation default-value="true">${maven.compiler.useIncrementalCompilation}</useIncrementalCompilation>
  <verbose default-value="false">${maven.compiler.verbose}</verbose>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-resources-plugin:2.6:testResources (default-testResources)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <buildFilters default-value="${project.build.filters}"/>
  <encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
  <escapeString>${maven.resources.escapeString}</escapeString>
  <escapeWindowsPaths default-value="true">${maven.resources.escapeWindowsPaths}</escapeWindowsPaths>
  <includeEmptyDirs default-value="false">${maven.resources.includeEmptyDirs}</includeEmptyDirs>
  <outputDirectory default-value="${project.build.testOutputDirectory}"/>
  <overwrite default-value="false">${maven.resources.overwrite}</overwrite>
  <project default-value="${project}"/>
  <resources default-value="${project.testResources}"/>
  <session default-value="${session}"/>
  <skip>${maven.test.skip}</skip>
  <supportMultiLineFiltering default-value="false">${maven.resources.supportMultiLineFiltering}</supportMultiLineFiltering>
  <useBuildFilters default-value="true"/>
  <useDefaultDelimiters default-value="true"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-compiler-plugin:3.9.0:testCompile (default-testCompile)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <basedir default-value="${basedir}"/>
  <buildDirectory default-value="${project.build.directory}"/>
  <compileSourceRoots default-value="${project.testCompileSourceRoots}"/>
  <compilerId default-value="javac">${maven.compiler.compilerId}</compilerId>
  <compilerReuseStrategy default-value="${reuseCreated}">${maven.compiler.compilerReuseStrategy}</compilerReuseStrategy>
  <compilerVersion>${maven.compiler.compilerVersion}</compilerVersion>
  <debug default-value="true">${maven.compiler.debug}</debug>
  <debuglevel>${maven.compiler.debuglevel}</debuglevel>
  <encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
  <executable>${maven.compiler.executable}</executable>
  <failOnError default-value="true">${maven.compiler.failOnError}</failOnError>
  <failOnWarning default-value="false">${maven.compiler.failOnWarning}</failOnWarning>
  <forceJavacCompilerUse default-value="false">${maven.compiler.forceJavacCompilerUse}</forceJavacCompilerUse>
  <fork default-value="false">${maven.compiler.fork}</fork>
  <generatedTestSourcesDirectory default-value="${project.build.directory}/generated-test-sources/test-annotations"/>
  <maxmem>${maven.compiler.maxmem}</maxmem>
  <meminitial>${maven.compiler.meminitial}</meminitial>
  <mojoExecution default-value="${mojoExecution}"/>
  <optimize default-value="false">${maven.compiler.optimize}</optimize>
  <outputDirectory default-value="${project.build.testOutputDirectory}"/>
  <parameters default-value="false">${maven.compiler.parameters}</parameters>
  <project default-value="${project}"/>
  <release>${maven.compiler.release}</release>
  <session default-value="${session}"/>
  <showDeprecation default-value="false">${maven.compiler.showDeprecation}</showDeprecation>
  <showWarnings default-value="false">${maven.compiler.showWarnings}</showWarnings>
  <skip>${maven.test.skip}</skip>
  <skipMultiThreadWarning default-value="false">${maven.compiler.skipMultiThreadWarning}</skipMultiThreadWarning>
  <source default-value="1.7">1.8</source>
  <staleMillis default-value="0">${lastModGranularityMs}</staleMillis>
  <target default-value="1.7">1.8</target>
  <testPath default-value="${project.testClasspathElements}"/>
  <testRelease>${maven.compiler.testRelease}</testRelease>
  <testSource>1.8</testSource>
  <testTarget>1.8</testTarget>
  <useIncrementalCompilation default-value="true">${maven.compiler.useIncrementalCompilation}</useIncrementalCompilation>
  <verbose default-value="false">${maven.compiler.verbose}</verbose>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M5:test (default-test)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <additionalClasspathElements>${maven.test.additionalClasspath}</additionalClasspathElements>
  <argLine>${argLine}</argLine>
  <basedir default-value="${basedir}"/>
  <childDelegation default-value="false">${childDelegation}</childDelegation>
  <classesDirectory default-value="${project.build.outputDirectory}"/>
  <classpathDependencyExcludes>${maven.test.dependency.excludes}</classpathDependencyExcludes>
  <debugForkedProcess>${maven.surefire.debug}</debugForkedProcess>
  <dependenciesToScan>${dependenciesToScan}</dependenciesToScan>
  <disableXmlReport default-value="false">${disableXmlReport}</disableXmlReport>
  <enableAssertions default-value="true">${enableAssertions}</enableAssertions>
  <enableProcessChecker>${surefire.enableProcessChecker}</enableProcessChecker>
  <encoding default-value="${project.reporting.outputEncoding}">${surefire.encoding}</encoding>
  <excludedEnvironmentVariables>${surefire.excludedEnvironmentVariables}</excludedEnvironmentVariables>
  <excludedGroups>${excludedGroups}</excludedGroups>
  <excludesFile>${surefire.excludesFile}</excludesFile>
  <failIfNoSpecifiedTests>${surefire.failIfNoSpecifiedTests}</failIfNoSpecifiedTests>
  <failIfNoTests>${failIfNoTests}</failIfNoTests>
  <forkCount default-value="1">${forkCount}</forkCount>
  <forkMode default-value="once">${forkMode}</forkMode>
  <forkNode>${surefire.forkNode}</forkNode>
  <forkedProcessExitTimeoutInSeconds default-value="30">${surefire.exitTimeout}</forkedProcessExitTimeoutInSeconds>
  <forkedProcessTimeoutInSeconds>${surefire.timeout}</forkedProcessTimeoutInSeconds>
  <groups>${groups}</groups>
  <includesFile>${surefire.includesFile}</includesFile>
  <junitArtifactName default-value="junit:junit">${junitArtifactName}</junitArtifactName>
  <jvm>${jvm}</jvm>
  <localRepository default-value="${localRepository}"/>
  <objectFactory>${objectFactory}</objectFactory>
  <parallel>${parallel}</parallel>
  <parallelMavenExecution default-value="${session.parallel}"/>
  <parallelOptimized default-value="true">${parallelOptimized}</parallelOptimized>
  <parallelTestsTimeoutForcedInSeconds>${surefire.parallel.forcedTimeout}</parallelTestsTimeoutForcedInSeconds>
  <parallelTestsTimeoutInSeconds>${surefire.parallel.timeout}</parallelTestsTimeoutInSeconds>
  <perCoreThreadCount default-value="true">${perCoreThreadCount}</perCoreThreadCount>
  <pluginArtifactMap>${plugin.artifactMap}</pluginArtifactMap>
  <pluginDescriptor default-value="${plugin}"/>
  <printSummary default-value="true">${surefire.printSummary}</printSummary>
  <project default-value="${project}"/>
  <projectArtifactMap>${project.artifactMap}</projectArtifactMap>
  <projectBuildDirectory default-value="${project.build.directory}"/>
  <projectRemoteRepositories default-value="${project.remoteArtifactRepositories}"/>
  <redirectTestOutputToFile default-value="false">${maven.test.redirectTestOutputToFile}</redirectTestOutputToFile>
  <remoteRepositories default-value="${project.pluginArtifactRepositories}"/>
  <reportFormat default-value="brief">${surefire.reportFormat}</reportFormat>
  <reportNameSuffix default-value="">${surefire.reportNameSuffix}</reportNameSuffix>
  <reportsDirectory default-value="${project.build.directory}/surefire-reports"/>
  <rerunFailingTestsCount default-value="0">${surefire.rerunFailingTestsCount}</rerunFailingTestsCount>
  <reuseForks default-value="true">${reuseForks}</reuseForks>
  <runOrder default-value="filesystem">${surefire.runOrder}</runOrder>
  <session default-value="${session}"/>
  <shutdown default-value="exit">${surefire.shutdown}</shutdown>
  <skip default-value="false">${maven.test.skip}</skip>
  <skipAfterFailureCount default-value="0">${surefire.skipAfterFailureCount}</skipAfterFailureCount>
  <skipExec>${maven.test.skip.exec}</skipExec>
  <skipTests default-value="false">${skipTests}</skipTests>
  <suiteXmlFiles>${surefire.suiteXmlFiles}</suiteXmlFiles>
  <systemPropertiesFile>${surefire.systemPropertiesFile}</systemPropertiesFile>
  <tempDir default-value="surefire">${tempDir}</tempDir>
  <test>${test}</test>
  <testClassesDirectory default-value="${project.build.testOutputDirectory}"/>
  <testFailureIgnore default-value="false">${maven.test.failure.ignore}</testFailureIgnore>
  <testNGArtifactName default-value="org.testng:testng">${testNGArtifactName}</testNGArtifactName>
  <testSourceDirectory default-value="${project.build.testSourceDirectory}"/>
  <threadCount>${threadCount}</threadCount>
  <threadCountClasses default-value="0">${threadCountClasses}</threadCountClasses>
  <threadCountMethods default-value="0">${threadCountMethods}</threadCountMethods>
  <threadCountSuites default-value="0">${threadCountSuites}</threadCountSuites>
  <trimStackTrace default-value="true">${trimStackTrace}</trimStackTrace>
  <useFile default-value="true">${surefire.useFile}</useFile>
  <useManifestOnlyJar default-value="true">${surefire.useManifestOnlyJar}</useManifestOnlyJar>
  <useModulePath default-value="true">${surefire.useModulePath}</useModulePath>
  <useSystemClassLoader default-value="true">${surefire.useSystemClassLoader}</useSystemClassLoader>
  <useUnlimitedThreads default-value="false">${useUnlimitedThreads}</useUnlimitedThreads>
  <workingDirectory>${basedir}</workingDirectory>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-jar-plugin:2.4:jar (default-jar)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <classesDirectory default-value="${project.build.outputDirectory}"/>
  <defaultManifestFile default-value="${project.build.outputDirectory}/META-INF/MANIFEST.MF"/>
  <finalName default-value="${project.build.finalName}">${jar.finalName}</finalName>
  <forceCreation default-value="false">${jar.forceCreation}</forceCreation>
  <outputDirectory default-value="${project.build.directory}"/>
  <project default-value="${project}"/>
  <session default-value="${session}"/>
  <skipIfEmpty default-value="false">${jar.skipIfEmpty}</skipIfEmpty>
  <useDefaultManifestFile default-value="false">${jar.useDefaultManifestFile}</useDefaultManifestFile>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-install-plugin:2.4:install (default-install)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <artifact default-value="${project.artifact}"/>
  <attachedArtifacts default-value="${project.attachedArtifacts}"/>
  <createChecksum default-value="false">${createChecksum}</createChecksum>
  <localRepository>${localRepository}</localRepository>
  <packaging default-value="${project.packaging}"/>
  <pomFile default-value="${project.file}"/>
  <skip default-value="false">${maven.install.skip}</skip>
  <updateReleaseInfo default-value="false">${updateReleaseInfo}</updateReleaseInfo>
</configuration>
[DEBUG] =======================================================================
[DEBUG] Dependency collection stats {ConflictMarker.analyzeTime=37900, ConflictMarker.markTime=10100, ConflictMarker.nodeCount=16, ConflictIdSorter.graphTime=7100, ConflictIdSorter.topsortTime=8000, ConflictIdSorter.conflictIdCount=8, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=131000, ConflictResolver.conflictItemCount=15, DefaultDependencyCollector.collectTime=2004400, DefaultDependencyCollector.transformTime=207500}
[DEBUG] org.gradle:project8:jar:1.0-SNAPSHOT
[DEBUG]    org.gradle:project4:jar:1.0-SNAPSHOT:compile
[DEBUG]       org.gradle:project1:jar:1.0-SNAPSHOT:compile
[DEBUG]       org.gradle:project2:jar:1.0-SNAPSHOT:compile
[DEBUG]    org.gradle:project7:jar:1.0-SNAPSHOT:compile
[DEBUG]       org.gradle:project5:jar:1.0-SNAPSHOT:compile
[DEBUG]       org.gradle:project6:jar:1.0-SNAPSHOT:compile
[DEBUG]    junit:junit:jar:4.13.1:test
[DEBUG]       org.hamcrest:hamcrest-core:jar:1.3:test
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ project8 ---
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-clean-plugin:2.5:clean from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-clean-plugin:2.5, parent: jdk.internal.loader.ClassLoaders$AppClassLoader@1ebdb06]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-clean-plugin:2.5:clean' with basic configurator -->
[DEBUG]   (f) directory = C:\work\github\MNG-7399\project8\target
[DEBUG]   (f) excludeDefaultDirectories = false
[DEBUG]   (f) failOnError = true
[DEBUG]   (f) followSymLinks = false
[DEBUG]   (f) outputDirectory = C:\work\github\MNG-7399\project8\target\classes
[DEBUG]   (f) retryOnError = true
[DEBUG]   (f) skip = false
[DEBUG]   (f) testOutputDirectory = C:\work\github\MNG-7399\project8\target\test-classes
[DEBUG] -- end configuration --
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] root 1.0 ........................................... SUCCESS [  0.216 s]
[INFO] project1 1.0-SNAPSHOT .............................. SUCCESS [ 17.386 s]
[INFO] project2 1.0-SNAPSHOT .............................. SUCCESS [ 15.381 s]
[INFO] project3 1.0-SNAPSHOT .............................. SUCCESS [ 15.339 s]
[INFO] project4 1.0-SNAPSHOT .............................. SUCCESS [ 15.431 s]
[INFO] project5 1.0-SNAPSHOT .............................. SUCCESS [ 15.391 s]
[INFO] project6 1.0-SNAPSHOT .............................. SUCCESS [ 15.023 s]
[INFO] project7 1.0-SNAPSHOT .............................. SUCCESS [ 14.951 s]
[INFO] project8 1.0-SNAPSHOT .............................. FAILURE [  0.026 s]
[INFO] project9 1.0-SNAPSHOT .............................. SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:49 min
[INFO] Finished at: 2022-02-11T18:13:26+03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean (default-clean) on project project8: The parameters 'reportDirectory' for goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean are missing or invalid -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean (default-clean) on project project8: The parameters 'reportDirectory' for goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean are missing or invalid
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:215)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:972)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:293)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:196)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:104)
    at java.lang.reflect.Method.invoke (Method.java:577)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
Caused by: org.apache.maven.plugin.PluginParameterException: The parameters 'reportDirectory' for goal org.apache.maven.plugins:maven-clean-plugin:2.5:clean are missing or invalid
    at org.apache.maven.plugin.internal.DefaultMavenPluginManager.populatePluginFields (DefaultMavenPluginManager.java:644)
    at org.apache.maven.plugin.internal.DefaultMavenPluginManager.getConfiguredMojo (DefaultMavenPluginManager.java:597)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:124)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:972)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:293)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:196)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:104)
    at java.lang.reflect.Method.invoke (Method.java:577)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
[ERROR]
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/PluginParameterException
[ERROR]
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :project8
```

</details>

It works perfectly fine on any other JDK.