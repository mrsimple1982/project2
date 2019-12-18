package main;

import i18n.ResourceHandler;

import javax.swing.filechooser.FileNameExtensionFilter;

public enum UserInputFile {
  
  JSON_GLOBAL(
    ResourceHandler.getMessage("inputGlobalJsonFile"),
    new FileNameExtensionFilter(ResourceHandler.getMessage("jsonFile"), "json"),
    FileOperation.OPEN
  ),
  JSON_MONTH(
    ResourceHandler.getMessage("inputMonthJsonFile"),
    new FileNameExtensionFilter(ResourceHandler.getMessage("jsonFile"), "json"),
    FileOperation.OPEN
  ),
  OUTPUT(
    ResourceHandler.getMessage("outputTexFile"),
    new FileNameExtensionFilter(ResourceHandler.getMessage("texFile"), "tex"),
    FileOperation.SAVE
  );
  
  private String dialogTitel;
  private FileNameExtensionFilter fileFilter;
  private FileOperation operation;
  
  private UserInputFile(String dialogTitel, FileNameExtensionFilter fileFilter, FileOperation operation) {
    this.dialogTitel = dialogTitel;
    this.fileFilter = fileFilter;
    this.operation = operation;
  }
  
  public FileNameExtensionFilter getFileFilter() {
    return this.fileFilter;
  }
  
  public String getDialogTitel() {
    return this.dialogTitel;
  }
  
  public FileOperation getFileOperation() {
	  return this.operation;
  }
  
  public enum FileOperation {
	  OPEN,
	  SAVE
  }
  
}
