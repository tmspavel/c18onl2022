package singleton.otherExamples.serializationExample;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    /*To add serialVersionId -
    File → Settings → Editor → Inspections → Java → Serialization issues → Serializable class without 'serialVersionUID'
    To add serial version plugin File → Settings → Plugin → in search file type GenerateSerialVersionUID and install*/
    @Serial
    private static final long serialVersionUID = -7751948350532408923L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {

        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    @Serial
    private Object readResolve() throws ObjectStreamException {
        return SingletonHelper.instance;
    }
}

