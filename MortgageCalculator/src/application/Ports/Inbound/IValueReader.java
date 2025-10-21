package application.Ports.Inbound;

public interface IValueReader {
    float GetFloatValue(String prompt, float defaultValue);
    short GetShortValue(String prompt, short defaultValue);
}
