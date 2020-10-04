package model;

import model.id.CurriculumId;
import model.id.TitleCode;

import java.util.List;

public class Section
{
	public Section(CurriculumId curriculumId,
	               TitleCode titleCode,
	               String deptName,
	               int catalogNumber,
	               String catalogSuffix,
	               int sectionNumber,
	               String sectionType,
	               double creditHours,
	               double minimumCreditHours,
	               String creditType,
	               String fixedOrVariable,
	               int classSize,
	               int seatsAvailable,
	               int waitlistSize,
	               String honors,
	               String mode,
	               String modeDesc,
	               String yearTerm,
	               List<Instructor> instructors,
	               List<Meeting> meetings)
	{
		this.curriculumId = curriculumId;
		this.titleCode = titleCode;
		this.deptName = deptName;
		this.catalogNumber = catalogNumber;
		this.catalogSuffix = catalogSuffix;
		this.sectionNumber = sectionNumber;
		this.sectionType = sectionType;
		this.creditHours = creditHours;
		this.minimumCreditHours = minimumCreditHours;
		this.creditType = creditType;
		this.fixedOrVariable = fixedOrVariable;
		this.classSize = classSize;
		this.seatsAvailable = seatsAvailable;
		this.waitlistSize = waitlistSize;
		this.honors = honors;
		this.mode = mode;
		this.modeDesc = modeDesc;
		this.yearTerm = yearTerm;
		this.instructors = instructors;
		this.meetings = meetings;
	}

	public CurriculumId getCurriculumId()
	{
		return curriculumId;
	}

	public TitleCode getTitleCode()
	{
		return titleCode;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public int getCatalogNumber()
	{
		return catalogNumber;
	}

	public String getCatalogSuffix()
	{
		return catalogSuffix;
	}

	public int getSectionNumber()
	{
		return sectionNumber;
	}

	public String getSectionType()
	{
		return sectionType;
	}

	public double getCreditHours()
	{
		return creditHours;
	}

	public double getMinimumCreditHours()
	{
		return minimumCreditHours;
	}

	public String getCreditType()
	{
		return creditType;
	}

	public String getFixedOrVariable()
	{
		return fixedOrVariable;
	}

	public int getClassSize()
	{
		return classSize;
	}

	public int getSeatsAvailable()
	{
		return seatsAvailable;
	}

	public int getWaitlistSize()
	{
		return waitlistSize;
	}

	public String getHonors()
	{
		return honors;
	}

	public String getMode()
	{
		return mode;
	}

	public String getModeDesc()
	{
		return modeDesc;
	}

	public String getYearTerm()
	{
		return yearTerm;
	}

	public List<Instructor> getInstructors()
	{
		return instructors;
	}

	public List<Meeting> getMeetings()
	{
		return meetings;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Section section = (Section) o;
		return curriculumId.equals(section.curriculumId) &&
				titleCode.equals(section.titleCode) &&
				sectionNumber == section.sectionNumber;
	}

	private final CurriculumId curriculumId;
	private final TitleCode titleCode;
	private final String deptName;
	private final int catalogNumber;
	private final String catalogSuffix;
	private final int sectionNumber;
	private final String sectionType;
	private final double creditHours;
	private final double minimumCreditHours;
	private final String creditType;
	private final String fixedOrVariable;
	private final int classSize;
	private final int seatsAvailable;
	private final int waitlistSize;
	private final String honors;
	private final String mode;
	private final String modeDesc;
	private final String yearTerm;
	private final List<Instructor> instructors;
	private final List<Meeting> meetings;
}
