package model.id;

public class ByuId
{
	ByuId(int value)
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
		ByuId byuId = (ByuId) o;
		return value == byuId.value;
	}

	private final int value;
}
