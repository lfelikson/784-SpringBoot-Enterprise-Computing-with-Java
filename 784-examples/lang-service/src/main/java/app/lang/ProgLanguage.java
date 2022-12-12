package app.lang;

//import app.lang.Language;

// class implements interface
class ProgLanguage implements Language {

	private String myLang = null ;
	
	public ProgLanguage( String lang) {
        myLang = lang;
    }

  // implementation of abstract methods
  @Override
  public void getType(String name) {
    System.out.println("Programming language is " + name);
  }
  @Override
  public void getVersion(String name) {
    System.out.println("version = " + name);
  }
}