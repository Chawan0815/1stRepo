package SettingAndGettingData;

public class College {
	private String collegeName;
    private int establishedYear;

    // Setter for collegeName
    public void setCollegeName(String name) {
        collegeName = name;
    }

    // Getter for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    // Setter for establishedYear
    public void setEstablishedYear(int year) {
        establishedYear = year;
    }

    // Getter for establishedYear
    public int getEstablishedYear() {
        return establishedYear;
    }
}
