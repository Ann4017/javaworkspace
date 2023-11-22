package fileupload;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

public class FileUtil {
	public static MultipartRequest upload_file(HttpServletRequest _req, String _save_directory, int _max_post_size) {

		try {
			return new MultipartRequest(_req, _save_directory, _max_post_size, "UTF-8");
		} catch (Exception e) {
			return null;
		}

	}

	public static void delete_file(HttpServletRequest _req, String _save_directort, String _file_name) {

		String s_directory = _req.getServletContext().getRealPath(_save_directort);
		File file = new File(s_directory + File.separator + _file_name);

		if (file.exists()) {
			file.delete();
		}

	}
}
