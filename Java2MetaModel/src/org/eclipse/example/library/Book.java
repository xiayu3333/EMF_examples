
package org.eclipse.example.library;
/**
 * @model
 */
public interface Book
{
  /**
   * @model
   */
  String getTitle();
  /**
   * @model default="100"
   */
  int getPages();
  /**
   * @model opposite="books"
   */
  Writer getAuthor();
  /**
   * @model
   */
  BookCategory getCategory();
}