package models;

/**
 * A contact in this application.
 * <p>
 * Created by Branden Ogata on 3/14/2015.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private long id;
  private String address;


  /**
   * Creates a new Contact.
   *
   * @param id          The long equal to the ID for the new Contact.
   * @param firstName   The String containing the first name of the new Contact.
   * @param lastName    The String containing the last name of the new Contact.
   * @param phoneNumber The String containing the phone number of the new Contact.
   * @param address     The String containing the address of the new contact
   */

  public Contact(long id, String firstName, String lastName, String phoneNumber, String address) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  /**
   * Returns the ID of this Contact.
   *
   * @return A long equal to the ID number of this Contact.
   */

  public long getId() {
    return this.id;
  }

  /**
   * Returns the first name of this Contact.
   *
   * @return A String containing the first name of this Contact.
   */

  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of this Contact.
   *
   * @return A String containing the last name of this Contact.
   */

  public String getLastName() {
    return this.lastName;
  }

  /**
   * Returns the phone number of this Contact.
   *
   * @return A String containing the phone number of this Contact.
   */

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * Returns the address of this contact.
   *
   * @return A String containing the address of this contact.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Indicates whether this is a valid Contact.
   *
   * @return A boolean that is true if this Contact is valid,
   * false otherwise.
   */


  public boolean isValid() {
    return (((this.firstName != null) && (this.firstName.length() > 0))
        && ((this.lastName != null) && (this.lastName.length() > 0))
        && ((this.address != null) && (this.address.length() >= 24))
        && ((this.phoneNumber != null) && (this.phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}"))));
  }
}
