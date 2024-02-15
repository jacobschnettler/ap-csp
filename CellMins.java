// Jacob Schnettler
// 11/14/2023
// AP CS A

public class CellMins
{
    private int minutesUsed, totalMinutesAvailable;

    public CellMins()
    {
        minutesUsed = 15;
        totalMinutesAvailable = 30;
    }

    public CellMins(int _minutesUsed, int _totalMinutesAvailable)
    {
        if (!(_minutesUsed <= -1))
            minutesUsed = _minutesUsed;

        if (!(_totalMinutesAvailable <= -1))
            totalMinutesAvailable = _totalMinutesAvailable;
    }

    public CellMins(CellMins copy)
    {
        minutesUsed = copy.getUsedMins();
        totalMinutesAvailable = copy.getAllowedMins();
    }

    public int getUsedMins()
    {
        return minutesUsed;
    }

    public int getAllowedMins()
    {
        return totalMinutesAvailable;
    }

    public void setAllowedMins(int allowedMins)
    {
        if (!(allowedMins <= -1))
            totalMinutesAvailable = allowedMins;
    }

    public void reset()
    {
        minutesUsed = 0;
    }

    public int getMinsRemaining()
    {
        return totalMinutesAvailable - minutesUsed;
    }

    public String toString()
    {
        return "Minutes allowed " + totalMinutesAvailable + ", Minutes used " + minutesUsed;
    }

    public boolean equals(CellMins b)
    {
        return getAllowedMins() == b.getAllowedMins();
    }

    /*
    public CellMins copy()
    {
        return new CellMins(minutesUsed, totalMinutesAvailable);
    }
    */

    public int compareTo(CellMins b)
    {
        if (getMinsRemaining() == b.getMinsRemaining()) return 0;
        
        return (getMinsRemaining() > b.getMinsRemaining()) ? 1 : -1;
    }

}
