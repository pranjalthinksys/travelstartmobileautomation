package Utilities;


import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Optional.ofNullable;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.BaseScreenRecordingOptions;
import io.appium.java_client.screenrecording.ScreenRecordingUploadOptions;

import java.time.Duration;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

	public abstract class BaseStartScreenRecordingOptions 
	        extends BaseScreenRecordingOptions {
	    private Boolean forceRestart;
	    private Duration timeLimit;

	    /**
	     * The remotePath upload option is the path to the remote location,
	     * where the resulting video should be uploaded.
	     * The following protocols are supported: http/https (multipart), ftp.
	     * Missing value (the default setting) means the content of the resulting
	     * file should be encoded as Base64 and passed as the endpoint response value, but
	     * an exception will be thrown if the generated media file is too big to
	     * fit into the available process memory.
	     * This option only has an effect if there is a screen recording session in progress
	     * and forced restart is not enabled (the default setting).
	     *
	     * @param uploadOptions see the documentation on {@link ScreenRecordingUploadOptions}
	     *                      for more details.
	     * @return 
	     * @return self instance for chaining.
	     */
//	    @Override
//	    public  T withUploadOptions(ScreenRecordingUploadOptions uploadOptions) {
//	        //noinspection unchecked
//	        return (T) super.withUploadOptions(uploadOptions);
//	    }

	    /**
	     * The maximum recording time.
	     *
	     * @param timeLimit The actual time limit of the recorded video.
	     * @return self instance for chaining.
	     */
	    public AndroidStartScreenRecordingOptions withTimeLimit(Duration timeLimit) {
	        this.timeLimit = checkNotNull(timeLimit);
	        //noinspection unchecked
	        return  this.withTimeLimit(timeLimit);
	    }

	    /**
	     * Whether to ignore the result of previous capture and start a new recording
	     * immediately. By default the endpoint will try to catch and return the result of
	     * the previous capture if it's still available.
	     *
	     * @return self instance for chaining.
	     */


	    @Override
	    public Map build() {
	        final ImmutableMap.Builder builder = ImmutableMap.builder();
	        builder.putAll(super.build());
	        ofNullable(timeLimit).map(x -> builder.put("timeLimit", x.getSeconds()));
	        ofNullable(forceRestart).map(x -> builder.put("forceRestart", x));
	        return builder.build();
	    }
	}


