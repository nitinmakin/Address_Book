package bridgelabz;

public interface IAddressBook {
	public void Create();
    public void Display();
    public void deletePersonData(String name);
    public void updatePersonDetails(int personId);
    public void sortByfirstName();
    public void sortBypincode();
}
