package com.prestodb.udfs;
import com.facebook.presto.common.type.StandardTypes;
import com.facebook.presto.spi.function.Description;
import com.facebook.presto.spi.function.ScalarFunction;
import com.facebook.presto.spi.function.SqlType;
import java.util.Random;
public class customUdf {

    private customUdf() {}

    @Description("Returns a random number")
    @ScalarFunction("randomNumberGenerator")
    @SqlType(StandardTypes.BIGINT)
    public static long randomNumberGenerator()
    {

        Random rd = new Random();
        return rd.nextInt();
    }

}
