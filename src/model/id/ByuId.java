package model.id;

import java.util.Objects;

public class ByuId
{
	public ByuId(int value)
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

	@Override
	public int hashCode()
	{
		return Objects.hash(value);
	}

	private final int value;
}
