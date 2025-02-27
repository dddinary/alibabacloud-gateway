// This file is auto-generated, don't edit it. Thanks.

using System.IO;
using Ionic.Zlib;

namespace AlibabaCloud.GatewaySls_Util
{
    public class Decompressor
    {
        public static bool IsDecompressorAvailable(string compressType)
        {
            return compressType == "deflate" || compressType == "gzip";
        }
        public static Stream GzipDecompress(Stream input, long bodyRawSize)
        {
            MemoryStream output = new MemoryStream();
            using (var stream = new ZlibStream(input, Ionic.Zlib.CompressionMode.Decompress))
            {
                stream.CopyTo(output);
            }
            output.Position = 0;
            return output;
        }
    }

}
