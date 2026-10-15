How to run (put all 8 .java files in the SAME folder, no package)

Command line:
  javac *.java
  java MainPage

IDE (IntelliJ / NetBeans / Eclipse / VS Code):
  Add all 8 files to one project, then run MainPage.java (it has main).

Demo steps:
  1. Add Job -> Installation Job: ID J001, Somchai, 12 Main Rd, cost 1500, outlets 5
  2. Add Job -> Repair Job: ID R001, Malee, 99 Lake St, cost 800, fault "Short circuit"
  3. Search Jobs -> try all 4 criteria
  4. Type "abc" in Cost to see the error dialog (program does not crash)

GUI files: MainPage, DataEntryPage, SearchPage
Other files: JobInterface, Job, InstallationJob, RepairJob, Database
