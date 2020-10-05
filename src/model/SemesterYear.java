package model;

public class SemesterYear
{
	public SemesterYear(int semester, int year)
	{
		this.semester = semester;
		this.year = year;
	}

	public SemesterYear(String semester, int year)
	{
		switch (semester.toLowerCase())
		{
			case "winter" -> this.semester = 1;
			case "spring" -> this.semester = 3;
			case "summer" -> this.semester = 4;
			case "fall" -> this.semester = 5;
			default -> this.semester = 0;
		}
		this.year = year;
	}

	public String getYearTerm()
	{
		return Integer.toString(year) + Integer.toString(semester);
	}

	private final int semester;
	private final int year;
}
