class MedicalRecordBuilder {
  private var _chiefComplaint = ""
  private var _presentingIllness = ""
  private var _pastMedicalHistory = ""
  private var _dragHistory = ""
  private var _socialHistory = ""
  private var _reviewOfSystems = ""
  private var _physicalExamination = ""
  private var _paraclinic = ""
  private var _summary = ""
  private var _impression = ""
  private var _plan = ""

  def withChiefComplaint(chiefComplaint: String): MedicalRecordBuilder = {
    this._chiefComplaint = chiefComplaint
    this
  }

  def withPresentingIllness(presentingIllness: String): MedicalRecordBuilder = {
    this._presentingIllness = presentingIllness
    this
  }

  def withPastMedicalHistory(pastMedicalHistory: String): MedicalRecordBuilder = {
    this._pastMedicalHistory = pastMedicalHistory
    this
  }

  def withDragHistory(dragHistory: String): MedicalRecordBuilder = {
    this._dragHistory = dragHistory
    this
  }

  def withSocialHistory(socialHistory: String): MedicalRecordBuilder = {
    this._socialHistory = socialHistory
    this
  }

  def withReviewOfSystems(reviewOfSystems: String): MedicalRecordBuilder = {
    this._reviewOfSystems = reviewOfSystems
    this
  }

  def withPhysicalExamination(physicalExamination: String): MedicalRecordBuilder = {
    this._physicalExamination = physicalExamination
    this
  }

  def withParaclinic(paraclinic: String): MedicalRecordBuilder = {
    this._paraclinic = paraclinic
    this
  }

  def withSummary(summary: String): MedicalRecordBuilder = {
    this._summary = summary
    this
  }

  def withImpression(impression: String): MedicalRecordBuilder = {
    this._impression = impression
    this
  }

  def withPlan(plan: String): MedicalRecordBuilder = {
    this._plan = plan
    this
  }

  def build(): MedicalRecord = new MedicalRecord(this._chiefComplaint, this._presentingIllness, this._pastMedicalHistory, this._dragHistory, this._socialHistory, this._reviewOfSystems, this._physicalExamination, this._paraclinic, this._summary, this._impression, this._plan)
  
}
