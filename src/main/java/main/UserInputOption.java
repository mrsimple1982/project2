package main;

import i18n.ResourceHandler;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public enum UserInputOption {
  
  HELP(Option.builder("h")
      .longOpt("help")
      .desc(ResourceHandler.getMessage("commandHelpDesc"))
      .hasArg(false)
      .build()),
  VERSION(Option.builder("v")
      .longOpt("version")
      .desc(ResourceHandler.getMessage("commandVersionDesc"))
      .hasArg(false)
      .build()),
  GUI(Option.builder("g")
      .longOpt("gui")
      .desc(ResourceHandler.getMessage("commandGuiDesc"))
      .hasArg(false)
      .build()),
  FILE(Option.builder("f")
      .longOpt("file")
      .desc(ResourceHandler.getMessage("commandFileDesc"))
      .numberOfArgs(3)
      .argName("global.json> <month.json> <output-file.tex")
      .build());
  
  private Option option;
  
  private UserInputOption (Option option) {
    this.option = option;
  }
  
  public Option getOption() {
    return this.option;
  }
  
  public static Options getOptions() {
    Options options = new Options();
    for(UserInputOption uio : UserInputOption.values()) {
      options.addOption(uio.getOption());
    }
    return options;
  } 
}
