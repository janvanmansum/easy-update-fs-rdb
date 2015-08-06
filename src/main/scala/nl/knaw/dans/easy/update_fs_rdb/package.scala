package nl.knaw.dans.easy

import com.yourmediashelf.fedora.client.FedoraCredentials

package object update_fs_rdb {

  case class Settings(fedoraCredentials: FedoraCredentials,
                      pid: String)

  abstract class DigitalObject(pid: String,
                               parentSid: String,
                               datasetSid: String,
                               path: String)

  case class EasyFolder(pid: String,
                        parentSid: String,
                        datasetSid: String,
                        path: String,
                        name: String) extends DigitalObject(pid, parentSid, datasetSid, path)

  case class EasyFile(pid: String,
                      parentSid: String,
                      datasetSid: String,
                      path: String,
                      filename: String,
                      size: Int,
                      mimetype: String,
                      creatorRole: String,
                      visibleTo: String,
                      accessibleTo: String,
                      sha1checksum: String) extends DigitalObject(pid, parentSid, datasetSid, path)

}
