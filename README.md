# spring-inheritance
This repository is used to display a question how Spring deals with inheritance of Spring beans.
See the 'fixed-name-conflict' branch on how the issue was resolved.

# Comments
Output when executing the main-method of InheritanceTest:  
Print from child.  
Parent names: [parent, child, parentName1, childName1]  
Child names: [child, parentName1, childName1]  
  
Not overriding the method from the Parent class enables resolved this issue.
