
import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class Map extends Mapper<LongWritable, Text, Text, NullWritable>{

	@Override
	public void map(LongWritable key, Text value, Context context)
		throws IOException, InterruptedException {
		String line = value.toString();
		String[] data = line.split("\t");
		
		try {
			String searchTerm = data[1];
		
			context.write(new Text(searchTerm), NullWritable.get());
		} catch (Exception e){
			// HANDLE IT
		}
		
	}
	
}
