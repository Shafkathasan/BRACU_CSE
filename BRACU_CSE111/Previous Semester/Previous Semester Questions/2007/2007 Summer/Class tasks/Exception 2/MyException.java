class MyException extends Exception {
  private String detail;

  MyException(String s) {
    detail = s;
  }

  public String toString() {
    return "MyException[" + detail + "]";
  }
}
