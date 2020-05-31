package FastJson.Singleton;

import com.alibaba.fastjson.serializer.SerializeConfig;

public class SerializeConfigSingleton {
    private volatile static SerializeConfig singleton;

    private SerializeConfigSingleton() {
    }

    public static SerializeConfig getInstance() {
        if (singleton == null) {
            synchronized (SerializeConfig.class) {
                if (singleton == null) {
                    singleton = new SerializeConfig();
                }
            }
        }
        return singleton;
    }

}
