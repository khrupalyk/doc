/**
 * Created by Khrupalyk on 9/28/15.
 */

var Doctor = React.createClass({

    render: function () {

        var doctor = this.props.doctor;
        var isFirst = this.props.first;

        var classForRow = "doc-row ";
        if (isFirst)
            classForRow += "first-row";

        return (
            <div className={classForRow}>
                <div className='doc-info-block'>
                    <div className='image-block'>
                        <img src='http://directory.iasishealthcare.com/images/physicians/doctor_placeholder.jpg'
                             className='doc-image'/>
                    </div>
                    <div className='doc-info-small'>
                        <div className='doc-name'>{doctor.firstName} {doctor.lastName}</div>
                        <div className='speciality'>{doctor.specialty}</div>
                        <div className='address'>{doctor.location}</div>
                    </div>
                </div>
            </div>
        );
    }

});