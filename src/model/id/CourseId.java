package model.id;

import java.util.Objects;

public class CourseId
{
	public CourseId(CurriculumId curriculumId, TitleCode titleCode)
	{
		this.curriculumId = curriculumId;
		this.titleCode = titleCode;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CourseId courseId = (CourseId) o;
		return curriculumId.equals(courseId.curriculumId) && titleCode.equals(courseId.titleCode);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(curriculumId, titleCode);
	}

	private final CurriculumId curriculumId;
	private final TitleCode titleCode;
}
