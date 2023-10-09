
/*Rule 02. Expressions (EXP)
XP00-J. Do not ignore values returned by methods Given the non-compliant code
below:
Noncompliant Code Example (File Deletion)*/

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
} 
/*Compliant Solution
Correct the code as shown in the Compliant Solution below:*/

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}