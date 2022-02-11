# Test project to reproduce MNG-7399

This test project is a "hierarchical" multi-project (or multi-module in the Maven world) build:
- 10 projects
- each project has 500 source files
- inter-project dependencies simulate "real world" projects with "upper" projects depending on up-to 3 "lower level" projects