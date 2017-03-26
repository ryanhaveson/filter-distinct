
import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reduce extends Reducer<Text, NullWritable, Text, NullWritable> {
	@Override
	public void reduce(final Text key,
						final Iterable<NullWritable> values, 
						final Context context )
			throws IOException, InterruptedException{
		context.write(key, NullWritable.get());
	}

}
