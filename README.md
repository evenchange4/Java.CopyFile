Java CopyFile
=============

This is a Java Copy File example that I try to copy `input.xml` in `utf8` format, and ouput the same content to `output.xml` file.

## How to run

```
$ javac CopyFile.java
$ java CopyFile 
$ head output.xml


# output as below	
# =>
<?xml version="1.0" encoding="UTF-8"?>
<xml>
<topic>
<number>CIRB010TopicZH001</number>
<title>集會遊行法與言論自由</title>
<question>
查詢集會遊行法中有關主張共產主義或分裂國土規定之修正與討論。
</question>
<narrative>
相關文件內容應敘述集會遊行法原本對主張共產主義或分裂國土之限制，其是否符合憲法中對言論自由等基本人權 的保障，大法官對此議題的相關解釋，學者專家的討論與看法，以及集會遊行法條文的修改現況。

```
