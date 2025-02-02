import { Injectable } from '@angular/core';
import { Plugins, CameraResultType, Capacitor, FilesystemDirectory, CameraPhoto, CameraSource } from '@capacitor/core';

const { Camera, Filesystem, Storage } = Plugins;

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor() { }

  public photos: Photo[] = [];

  public async addNewToGallery() {
    // Take a photo
    const capturedPhoto = await Camera.getPhoto({
      resultType: CameraResultType.Uri, 
      source: CameraSource.Camera, 
      quality: 100 
    });

    //add photo to array
    this.photos.unshift({
      filepath: "soon...",
      webviewPath: capturedPhoto.webPath
     });

  }

}

interface Photo {
  filepath: string;
  webviewPath: string;
  base64?: string;
}
