package model;

import model.id.CourseId;

import java.util.Map;

public class Semester
{
	public Semester(SemesterYear semesterYear, Map<CourseId, Course> courses)
	{
		this.semesterYear = semesterYear;
		this.courses = courses;
	}

	public Semester(SemesterYear semesterYear)
	{
		this.semesterYear = semesterYear;
		this.courses = null;
	}

	public SemesterYear getSemesterYear()
	{
		return semesterYear;
	}

	public Map<CourseId, Course> getCourses()
	{
		return courses;
	}

	private final SemesterYear semesterYear;
	private final Map<CourseId, Course> courses;
}
