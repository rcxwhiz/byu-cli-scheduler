package model.id;

public class CurriculumId
{
	CurriculumId(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CurriculumId curriculumId = (CurriculumId) o;
		return value == curriculumId.value;
	}

	private final int value;
}
