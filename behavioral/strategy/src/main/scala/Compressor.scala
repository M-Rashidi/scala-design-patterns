//Strategy
trait Compressor {
  def compress(content: Array[Byte]): Array[Byte]
}

//Concrete Strategy
class ZipCompressor extends Compressor {
  def compress(content: Array[Byte]): Array[Byte] = null
}

//Context
class FolderCompressor(var _compressor: Compressor) {
  def compress(path: String): Array[Byte] = {
    val files = this.getFiles(path)
    for (file <- files) {
      val content = this.readFile(files)
      val compressed = this._compressor.compress(content)
    }
    null
  }

  private def readFile(files: List[String]):  Array[Byte] = null

  private def getFiles(path: String): List[String] = null
}