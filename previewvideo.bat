@ECHO OFF
REM FF Prompt 1.2
REM Open a command prompt to run ffmpeg/ffplay/ffprobe
REM Copyright (C) 2013-2015  Kyle Schwarz

TITLE FF Prompt

IF NOT EXIST bin\ffmpeg.exe (
  CLS
  ECHO bin\ffmpeg.exe could not be found.
  GOTO:error
)

CD bin || GOTO:error
PROMPT $P$_$G
SET PATH=%CD%;%PATH%
CLS



ffplay prew.mp4