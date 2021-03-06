/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.freesr;

public class SpeakerRecognizer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SpeakerRecognizer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpeakerRecognizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FreeSpeakerRecognitionJNI.delete_SpeakerRecognizer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SpeakerRecognizer(int sample_rate) {
    this(FreeSpeakerRecognitionJNI.new_SpeakerRecognizer__SWIG_0(sample_rate), true);
  }

  public SpeakerRecognizer() {
    this(FreeSpeakerRecognitionJNI.new_SpeakerRecognizer__SWIG_1(), true);
  }

  public boolean Init() {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_Init(swigCPtr, this);
  }

  public double VerifySpeaker(ArrayListDouble signal_1, ArrayListDouble signal_2) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_VerifySpeaker__SWIG_0(swigCPtr, this, ArrayListDouble.getCPtr(signal_1), signal_1, ArrayListDouble.getCPtr(signal_2), signal_2);
  }

  public double VerifySpeaker(String fpath_1, String fpath_2) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_VerifySpeaker__SWIG_1(swigCPtr, this, fpath_1, fpath_2);
  }

  public boolean RegisterSpeaker(ArrayListDouble signal, String speaker_name, String speaker_model) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_RegisterSpeaker__SWIG_0(swigCPtr, this, ArrayListDouble.getCPtr(signal), signal, speaker_name, speaker_model);
  }

  public boolean RegisterSpeaker(ArrayListDouble signal, String speaker_name) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_RegisterSpeaker__SWIG_1(swigCPtr, this, ArrayListDouble.getCPtr(signal), signal, speaker_name);
  }

  public boolean RegisterSpeaker(String fpath, String speaker_name, String speaker_model) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_RegisterSpeaker__SWIG_2(swigCPtr, this, fpath, speaker_name, speaker_model);
  }

  public boolean RegisterSpeaker(String fpath, String speaker_name) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_RegisterSpeaker__SWIG_3(swigCPtr, this, fpath, speaker_name);
  }

  public String RecognizeSpeaker(ArrayListDouble signal) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_RecognizeSpeaker__SWIG_0(swigCPtr, this, ArrayListDouble.getCPtr(signal), signal);
  }

  public String RecognizeSpeaker(String fpath) {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_RecognizeSpeaker__SWIG_1(swigCPtr, this, fpath);
  }

  public double GetConfidence() {
    return FreeSpeakerRecognitionJNI.SpeakerRecognizer_GetConfidence(swigCPtr, this);
  }

}
